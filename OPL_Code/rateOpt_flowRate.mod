float a = .01;
float b = -1.85;
float c = 174.56;
float lowerLimit = 13.27;
float upperLimit = 100;
dvar float waterRate;
dexpr float rxRate = a * (b * waterRate + c) ^ 2;

minimize rxRate;

subject to
{
	Constraint1: waterRate >= 0; 
	Constraint2: waterRate <= 100; 
	Constraint3: lowerLimit  <=  waterRate; 
	Constraint4: upperLimit  >=  waterRate; 
}

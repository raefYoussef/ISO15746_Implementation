using CP;

dvar int Power in 80 .. 160;
dvar int Speed in 360 .. 840;
dvar int Thickness in 20 .. 50;
dvar int Distance in 100 .. 160;
dvar int Al in 500 .. 650;
dvar int Va in 350 .. 450;
dvar int Oxygen in 130 .. 170;
dexpr float Time = 10.82*6+0.0125*25*5*11*11*6*0.3*1000/Thickness;
dexpr float Cost = 0.0526*(6-3.97*Al*0.01+20*Va*0.01);
dexpr float Energy = Power*20618*1000000/(Speed*Distance*Thickness);
dexpr float VolumeError = 37.1944 -0.150833*Power+0.103611*Thickness-0.451528*Distance + 0.000593750*Power*Power + 0.000111111*Thickness*Thickness+0.00169444*Distance*Distance+4.16667E-05*Power*Thickness+ 6.25000E-05*Power*Distance+0.000111111*Thickness*Distance;
dexpr float Strength = -730.849 + 0.464931*Speed + 5.72444*Thickness+17529.6*0.001*Oxygen-2.88194E-04*Speed*Speed-0.0884444*Thickness*Thickness-56125.0*0.000001*Oxygen*Oxygen+5.55556E-05*Speed*Thickness-0.802083*Speed*0.001*Oxygen+1.83333*Thickness*0.001*Oxygen;
dexpr float Roughness = 240.897 -0.722604*Power+ 1.29167*Thickness-2.91403*Distance+0.00284375*Power*Power+0.000555556*Thickness*Thickness+0.0109444*Distance*Distance-2.91667E-04*Power*Thickness+0.000500000*Power*Distance+0.000277778*Thickness*Distance;

minimize Cost;

subject to
{
	Constraint1: Time  <=  9500; 
	Constraint2: Energy  <=  750000; 
	Constraint3: VolumeError  <=  6.5; 
	Constraint4: Strength  >=  790.5; 
	Constraint5: Roughness  <=  70; 
}

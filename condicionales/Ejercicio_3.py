#Ejercicio 3
#Lea dos números A y B y escriba un mensaje que indique si el número A es mayor o no que el 
#número B.

numeroA = int(input('Ingrese un numero A: '));
numeroB = int(input('Ingrese un numero B: '));
if(numeroA < numeroB):
    print('Numero ',numeroB,' es mayor que el numero', numeroA);
else:
    print('Numero ',numeroA,' es mayor que el numero', numeroB);

input('Presione una tecla para terminar ...');

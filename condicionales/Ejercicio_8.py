#Lea desde el teclado un valore entero. Determine y escriba si el valor es múltiplo de once (11) 
#y/o múltiplo de tres (3)

num = int(input('Ingrese un numero: '));


if((num%11) == 0):
    print('El numero es multiplo de 11');
else:
    print('El numero no es multiplo de 11');

if((num%3) == 0):
    print('El numero es multiplo de 3');
else:
    print('El numero no es multiplo de 3');

input('Presione una tecla para terminar...');
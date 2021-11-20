#Ejercicio 4
#Lea tres números A, B y C y escriba un mensaje indicando si el número A esta o no en el rango 
#[ B, C ].

n1 = int(input('Ingrese el primero numero: ')); #A
n2 = int(input('Ingrese el segundo numero: ')); #B
n3 = int(input('Ingrese el tercer numero: ')); #C

if(n1 > n2 and n1 < n3 ):
    print('El valor ',n1,' se encuentra en el rango: [',n2,',',n3,'].');
input('Presione una tecla para finaizar...');
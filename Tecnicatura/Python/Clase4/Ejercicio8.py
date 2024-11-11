# Ejercicio 8: Menú interactivo - Cajero Automático
# Hacer un programa que simule un cajero automático con un saldo
# inicial de $1000 y tendrá el siguiente menú de opciones:
# 1. Ingresar dinero en la cuenta
# 2. Retirar dinero de la cuenta
# 3. Mostrar dinero disponible
# 4. Salir

saldo = 1000

while True:
    print("\t.MENU PRINCIPAL")
    print("1. Ingresar dinero en la cuenta.")
    print("2. Retirar  dinero de la cuenta.")
    print("3. Mostrar dinero en la cuenta.")
    print("4. Salir")

    opcion = int(input("Ingrese una opción"))
    print() #salto de linea
    if opcion == 1:
        extra = float(input("Cuanto dinero desea ingrear --> "))
        saldo = saldo + extra
        print(f"Saldo actual: ${saldo}")
    elif opcion == 2:
        retirar = float(input("Cuanto dinero desea retirar -->"))
        if retirar > saldo:
            print("Dinero insuficiente")
        else:
            saldo = saldo - retirar
            print(f"Saldo actual: {saldo}")
    elif opcion == 3:
        print(f"Saldo actual: {saldo}")
    elif opcion == 4:
        print("Gracias por usar nuestros servicios")
        break
    else:
        print("Ingrese una opción válida")


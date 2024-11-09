from monitor import Monitor
from orden import Orden
from raton import Raton
from teclado import Teclado
from computadora import Computadora


teclado1 = Teclado('Logitech', 'USB')
monitor1 = Monitor('Asus', '22 Pulgadas')
raton1 = Raton('Razer', 'Bluethooth')
computadora1 = Computadora('Asus', monitor1, teclado1, raton1)


teclado2 = Teclado('Corsair', 'Bluethooth')
monitor2 = Monitor('BenQ', '28 Pulgadas')
raton2 = Raton('Logitech', 'USB')
computadora2 = Computadora('MSI', monitor2, teclado2, raton2)


teclado3 = Teclado('Corsair', 'Bluethooth')
monitor3 = Monitor('ViewSonic', '27 Pulgadas')
raton3 = Raton('Corsair', 'Bluethooth')
computadora3 = Computadora('Nvidia', monitor3, teclado3, raton3)


teclado4 = Teclado('Acer', 'Bluethooth')
monitor4 = Monitor('Acer', '24 Pulgadas')
raton4 = Raton('Logitech', 'Bluethooth')
computadora4 = Computadora('Geforce', monitor4, teclado4, raton4)

teclado5 = Teclado('GameOver', 'Bluethooth')
monitor5 = Monitor('Samsung', '25 Pulgadas')
raton5 = Raton('Gamer', 'Bluethooth')
computadora5 = Computadora('Intel', monitor5, teclado5, raton5)


computadora6 = Computadora('AMD', monitor1, teclado2, raton4)
computadora7 = Computadora('Dell', monitor2, teclado3, raton5)


computadoras1 = [computadora1, computadora2, computadora7, computadora4]
orden1 = Orden(computadoras1)
orden1.agregar_computadora(computadora3)
print(orden1)


computadoras2 = [computadora3, computadora5, computadora6]
orden2 = Orden(computadoras2)
orden2.agregar_computadora(computadora1)
print(orden2)

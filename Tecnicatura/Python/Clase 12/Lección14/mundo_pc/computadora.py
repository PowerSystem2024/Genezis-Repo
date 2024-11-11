from monitor import Monitor
from raton import Raton
from teclado import Teclado


class Computadora:

    contador_computadoras = 0

    def __init__(self, nombre, monitor, teclado, raton):
        Computadora.contador_computadoras += 1
        self._id_computadora = Computadora.contador_computadoras
        self._nombre = nombre
        self._monitor = monitor
        self._teclado = teclado
        self._raton = raton
        
    def __str__(self):
        return f'''
            {self._nombre}: {self._id_computadora}
            Monitor: {self._monitor}
            Teclado: {self._teclado}            
            Raton: {self._raton}
        '''
    
if __name__ == '__main__':
    teclado1 = Teclado('Logitech', 'USB')
    monitor1 = Monitor('Asus', '22 Pulgadas')
    raton1 = Raton('Razer', 'Bluethooth')
    computadora1 = Computadora('Asus', monitor1, teclado1, raton1)
    print(computadora1)

    teclado2 = Teclado('Corsair', 'Bluethooth')
    monitor2 = Monitor('BenQ', '28 Pulgadas')
    raton2 = Raton('Logitech', 'USB')
    computadora2 = Computadora('MSI', monitor2, teclado2, raton2)
    print(computadora2)
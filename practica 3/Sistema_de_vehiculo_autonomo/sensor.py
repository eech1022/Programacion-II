class sensor():
    def __init__(self,id,**kwargs):
        super().__init__(**kwargs)
        self.tipo="generico"
        self.id=id
        self.encendido= False
    def activar(self):
        self.encendido= True
    def desactivar(self):
        self.encendido= False

class camara(sensor):
    def __init__(self,resolucion,**kwargs):
        super().__init__(**kwargs)
        self.tipo="camara"
        self.resolucion=resolucion
    def __str__(self):
        return "tipo: "+self.tipo+" id: "+self.id+" encendido: "+ str(self.encendido) +" resolucion: "+ self.resolucion
class SensorLuzLaser(sensor):
    def __init__(self,alcance,**kwargs):
        super().__init__(**kwargs)
        self.tipo="Luz Laser"
        self.alcance = alcance
    def __str__(self):
        return  " alcance: "+ str( self.alcance )

class vehiculo_autonomo(camara,SensorLuzLaser):
    def __init__(self,**kwargs):
        super().__init__(**kwargs)
        self.tipo="vehiculo autonomo"
    def __str__(self):
        return super().__str__() +" "+ SensorLuzLaser.__str__(self)

V=vehiculo_autonomo( id="5621", resolucion="500 px" , alcance= 200)
V.activar()
print(V)
print(vehiculo_autonomo.__mro__)
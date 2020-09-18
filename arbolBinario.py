class Nodo:
    def __init__(self, nombre,tipo,marca,valor,cantidad):
        self.hijoIzq = None
        self.hijoDer = None
        self.valor = valor
        self.nombre = nombre
        self.tipo=tipo
        self.marca=marca
        self.cantidad=cantidad
    def __str__(self):
        #return "%s %s %s "%(self.nombre,self.valor,self.cantidad)
        return "El nombre es: "+str(self.nombre)+"\nEl tipo del producto es: "+str(self.tipo)+"\nLa marca del producto es: "+str(self.marca)+"\nEl valor es: "+str(self.valor)+"\nLa cantidad es: "+str(self.cantidad)+"\n--------------"
        
class ArbolBinario:
    def __init__(self):
        self.raiz = None
        self.preo=[]
    def obtenerRaiz(self):
        return self.raiz

    def agregarNodos(self,nombre,tipo,marca,nodo_valor,cantidad):
        if (self.raiz == None):
            self.raiz = Nodo(nombre,tipo,marca,nodo_valor,cantidad)
        else:
            self._agregarNodos(nombre,tipo,marca,nodo_valor,cantidad, self.raiz)

    def _agregarNodos(self,nombre,tipo,marca, nodo_valor,cantidad, nodo_raiz):
        if (nodo_valor > int(nodo_raiz.valor)):
            if (nodo_raiz.hijoIzq != None):
                self._agregarNodos(nombre,tipo,marca,nodo_valor,cantidad, nodo_raiz.hijoIzq)
            else:
                nodo_raiz.hijoIzq = Nodo(nombre,tipo,marca,nodo_valor,cantidad)
        else:
            if (nodo_raiz.hijoDer != None):
                self._agregarNodos(nombre,tipo,marca,nodo_valor,cantidad, nodo_raiz.hijoDer)
            else:
                nodo_raiz.hijoDer = Nodo(nombre,tipo,marca,nodo_valor,cantidad)

    def encontrar(self, nodo_valor):
        if(self.raiz != None):
            return self._encontrar(nodo_valor, self.raiz)
        else:
            return None

    def _encontrar(self, nodo_valor, nodo_raiz):
        if (nodo_valor == int(nodo_raiz.valor)):
            return nodo_raiz
        elif (nodo_valor < nodo_raiz.valor and nodo_raiz.hijoIzq != None):
            return self._encontrar(nodo_valor, nodo_raiz.hijoIzq)
        elif(nodo_valor > nodo_raiz.valor and nodo_raiz.hijoDer != None):
            return self._encontrar(nodo_valor, nodo_raiz.hijoDer)

    def imprimirArbol(self):
        if(self.raiz != None):
            self._imprimirArbol(self.raiz)
    def prueba(self):
        acum=0
        self.cantidades()
        #print(self.preo)
        aux=len(self.preo)
        for i in range(0,aux):
          acum=self.preo[i]+acum
        print("La cantidad total de componente en la bodega son: ",acum)
        self.preo=None
        self.preo=[]
    def cantidades(self):
        if(self.raiz !=None):
            self._cantidad(self.raiz)
    def _cantidad(self, nodo_raiz):
        if(nodo_raiz != None):
            self._cantidad(nodo_raiz.hijoIzq)
            self.preo.append(int(nodo_raiz.cantidad))
            self._cantidad(nodo_raiz.hijoDer)
    def raiz(self):
        return self.raiz
    def Entrada(self,nodo_valor,nuevo):
        aux=self._encontrar(nodo_valor,self.raiz)
        preo=int(aux.cantidad)
        (aux.cantidad)=preo+nuevo
    def Salida(self,nodo_valor,nuevo):
        aux=self._encontrar(nodo_valor,self.raiz)
        if(aux==None):
            print("No se encontro el producto")
        else:
             preo=int(aux.cantidad)-nuevo
             post=int(aux.cantidad)
             if(preo <0):
              print("-----------Mensaje emergente--------------")
              print("No hay suficientes existencia del producto")
              print("Recalcule cantidad de salida")
             else:
              (aux.cantidad)=post-nuevo
             if(aux.cantidad ==0):
              print("Se acabaron las existencias")
    def _imprimirArbol(self, nodo_raiz):
        if(nodo_raiz != None):
            self._imprimirArbol(nodo_raiz.hijoIzq)
            print(nodo_raiz)
            self._imprimirArbol(nodo_raiz.hijoDer)
    def eliminarArbol(self):
        self.raiz = None
            
if __name__ == "__main__":
    arbol = ArbolBinario()
    opc=0
    arbol.agregarNodos("Ram de 8gb","Ram","Hiperx",100000,4)
    arbol.agregarNodos("procesador intel i5 oct","procesador","intel",1000000,7)
    arbol.agregarNodos("funte de poder de 450w","funte de poder","cooler",200000,6)
    arbol.agregarNodos("Board b450-m","placa madre","Asus",350000,8)
    print("       Bodega alto del Jom")
    print("Bienvenido al sofware de inventario")
    while(opc !=7):
        print("----Menu----\n"+
        "1. ingresar nuevo producto\n"+
        "2. Mostrar existencias\n"+
        "3. Buscar producto\n"+
        "4. Entrada de producto\n"+
        "5. salida de producto\n"+
        "6. total del inventario\n"+
        "7. salir del programa")
        num=input("Ingresar opcion ")
        if num =="1":
            nombre=input("Ingrese el nombre del componente ")
            print("Los tipos de producto son los siguientes:\n"+
            "-Procesador\n"+
            "-Ram\n"+
            "-Fuente de poder\n"+
            "-placa madre\n"+
            "-Unidad de almacenamiento")
            tipo=input("Ingrese el tipo de componente ")
            marca=input("Ingrese la marca del componente ")
            valor=int(input("Ingrese el valor del producto "))
            cantidad=int(input("Ingresar la cantidad "))
            arbol.agregarNodos(nombre,tipo,marca,valor,cantidad)
        elif num=="2":
            arbol.imprimirArbol()
        elif num=="3":
             valor=int(input("Ingresar valor del producto a buscar "))
             if(arbol.encontrar(valor)==None):
                 print("No se encontro")
             else:
                 print(arbol.encontrar(valor))
        elif num=="4":
              valor=int(input("Ingresar valor del producto "))
              nuevo=int(input("cantidad total de existencia "))
              arbol.Entrada(valor,nuevo)
        elif num=="5":
              valor=int(input("Ingresar valor del producto "))
              nuevo=int(input("cantidad de salida del producto "))
              arbol.Salida(valor,nuevo)
        elif num=="6":
              arbol.prueba()
        else:
            print("finalizando......")
            break

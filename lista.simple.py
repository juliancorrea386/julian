class node:
    def __init__(self, data = None, next = None):
        self.data = data
        self.next = next

# Creamos la clase linked_list
class lista: 
    def __init__(self):
        self.head = None
    
    
    def agregarFrente(self, data):
        self.head = node(data=data, next=self.head)  

    
    def vacia(self):
        return self.head == None

    # Método para agregar elementos al final de la linked list
    def agregarFinal(self, data):
        if not self.head:
            self.head = node(data=data)
            return
        curr = self.head
        while curr.next:
            curr = curr.next
        curr.next = node(data=data)
    
    # Método para eleminar nodos
    def Eliminar(self, key):
        curr = self.head
        prev = None
        while curr and curr.data != key:
            prev = curr
            curr = curr.next
        if prev is None:
            self.head = curr.next
        elif curr:
            prev.next = curr.next
            curr.next = None
    # Método para obtener el ultimo nodo
    def UltimoNodo(self):
        temp = self.head
        while(temp.next is not None):
            temp = temp.next
        return temp.data
    # Método para imprimir la lista de nodos
    def Imprimir( self ):
        node = self.head
        while node != None:
            print(node.data, end =" => ")
            node = node.next


s = lista() # Instancia de la clase
s.agregarFrente(5) # Agregamos un elemento al frente del nodo
s.agregarFrente(4) # Agregamos un elemento al final del nodo
s.agregarFrente(4) # Agregamos otro elemento al frente del nodo
s.agregarFrente(8)
num =s.UltimoNodo()
print(num)
s.Imprimir() # Imprimimos la lista de nodos

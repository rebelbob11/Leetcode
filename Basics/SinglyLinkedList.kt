class MyLinkedList() {

    var head: Node? = null
    var tail: Node? = null
    var size = 0

    fun get(index: Int): Int {
        if(index < 0 || index > size ) {
            return -1
        }

        var current = head
        for(i in 0 until index) {
            current = current?.nextNode
        }
        return current?.element ?: -1
    }

    fun addAtHead(x: Int) {
        var newNode = Node(x)
        if(head == null) {
            head = newNode
        } else {
            newNode?.nextNode = head
            head = newNode
        }
        size++
    }

    fun addAtTail(x: Int) {
        var newNode = Node(x)
        if(head == null) {
            head = newNode
        } else {
            var current = head
            while(current?.nextNode != null) {
                current = current?.nextNode
            }
            current?.nextNode = newNode
        }
        size++
    }

    fun addAtIndex(index: Int, x: Int) {
        if(index <0 || index > size) {
            return
        }

        if(index == 0) {
            addAtHead(x)
            size++
            return
        }

        if(index == size) {
            addAtTail(x)
            size++
            return
        }

        var newNode = Node(x)
        var current = head
        for(i in 0 until index - 1) {
            current = current?.nextNode
        }
        newNode?.nextNode = current?.nextNode
        current?.nextNode = newNode
        size++
    }

    fun deleteAtIndex(index: Int) {
        if(index < 0 || index > size) {
            return
        }

        if(index == 0) {
            head = head?.nextNode
        } else {
            var current = head
            for(i in 0 until index-1) {
                current = current?.nextNode
            }
            current?.nextNode = current?.nextNode?.nextNode
        }
        size--
    }

}

data class Node(var element: Int = 0, var nextNode: Node? = null)
/**
 * Your MyLinkedList object will be instantiated and called as such:
 * var obj = MyLinkedList()
 * var param_1 = obj.get(index)
 * obj.addAtHead(`val`)
 * obj.addAtTail(`val`)
 * obj.addAtIndex(index,`val`)
 * obj.deleteAtIndex(index)
 */
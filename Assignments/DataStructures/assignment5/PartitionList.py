class ListNode:
    def __init__(self, value=0, next=None):
        self.value = value
        self.next = next

def partition_list(head, x):
    
    before_dummy = ListNode()
    after_dummy = ListNode()
    
    
    before = before_dummy
    after = after_dummy

    
    current = head
    while current:
        if current.value < x:
            before.next = current
            before = before.next
        else:
            after.next = current
            after = after.next

        current = current.next

    
    before.next = after_dummy.next
    after.next = None  

    
    return before_dummy.next



original_list = ListNode(1, ListNode(4, ListNode(3, ListNode(2, ListNode(5, ListNode(2))))))
while original_list:
    print(original_list.value, end=" ")
    original_list = original_list.next


result_list = partition_list(original_list, 3)


while result_list:
    print(result_list.value, end=" ")
    result_list = result_list.next

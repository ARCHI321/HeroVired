class ListNode:
    def __init__(self, value=0, next=None):
        self.value = value
        self.next = next

def merge_sorted_lists(l1, l2):
    
    dummy = ListNode()
    current = dummy

    
    while l1 is not None and l2 is not None:
        
        if l1.value < l2.value:
            current.next = l1
            l1 = l1.next
        else:
            current.next = l2
            l2 = l2.next

        
        current = current.next

    
    if l1 is not None:
        current.next = l1
    else:
        current.next = l2

    
    return dummy.next



list1 = ListNode(1, ListNode(3, ListNode(5)))
list2 = ListNode(2, ListNode(4, ListNode(6)))


merged_list = merge_sorted_lists(list1, list2)


while merged_list is not None:
    
    print(merged_list.value, end=" ")
    merged_list = merged_list.next

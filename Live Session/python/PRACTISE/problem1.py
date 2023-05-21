# cook your dish here
for t in range(0,int(input())):
    n , k , v = map(int,input().split())
    arr = list(map(int,input().split()))
    s = sum(arr)
    #print(arr,s)
    total = (n+k) * v
    #print(total)
    if total < s or (total-s) % k != 0:
        print("-1")
        continue
    num = (total - s) // k
    print(num)

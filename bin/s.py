def sum_dig(n):
    r =0
    s =0
    while(n>0):
        r = n%10
        n = n//10
        s+=r
    return s

n = 99

while(n>9):
    n = sum_dig(n)
print(n)
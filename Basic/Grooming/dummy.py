n = 102030
result =0
a=1
while n> 0:
    ld=n%10
    if ld!=0:
        result += ld*a
        a *= 10
    n //= 10
print(result)
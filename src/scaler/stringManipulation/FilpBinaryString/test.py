arr = [11, 2 , 3, 5, 2, 6, 10, 1,2, 1]

max_profit = 0
profit = 0
gmin = arr[0]
gmax = arr[0]


profit = gmax - gmin
max_profit = profit
for elem in arr[1:]:
    if elem < gmin:
        gmin, gmax = elem, elem
    if elem > gmax:
        gmax = elem 
    
    profit = gmax - gmin
    if max_profit < profit:
        max_profit = profit
    
print(max_profit)
    
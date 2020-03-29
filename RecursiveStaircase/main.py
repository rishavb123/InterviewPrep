def num_ways(N):
    return 1 if N == 0 else 0 if N < 0 else num_ways(N - 1) + num_ways(N - 2)

table = {}

def num_ways_modified(N, steps=[1, 2]):
    if N in table: 
        return table[N]
    else:
        x = 1 if N == 0 else 0 if N < 0 else sum([num_ways_modified(N - s, steps) for s in steps])
        table[N] = x
        return x


N = int(input("Enter the value for N: "))
steps = [1, 3, 5]

print("Num of ways for staircase with", N, "stairs is", num_ways(N))
print("Num of ways for staircase with", N, "stairs and steps of", steps, "sizes is", num_ways_modified(N, steps))
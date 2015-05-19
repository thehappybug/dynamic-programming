# Dynamic Programming

Implements the following algorithms as examples of **Dynamic Programming**:

* [Unbounded Knapsack](https://goo.gl/X3HulT)
* [Modified Fibonacci](https://goo.gl/shnrr5)
* [Longest Common Subsequence](https://goo.gl/3x9hbD)

Implementation is provided in the package `io.gitbub.thehappybug.Algorithms`.

## Compiling

The project can be compiled using `make` tool:

```
$ make
cd io/github/thehappybug/Algorithms/ && javac *.java
```

The build directory can be cleaned again by running `make clean`.

```
$ make clean
rm io/github/thehappybug/Algorithms/*.class
```

## Running

```
$ cat inputs/fib.txt | java -cp "." io.github.thehappybug.Algorithms.FibonacciModified
5
$ cat inputs/knap.txt | java -cp "." io.github.thehappybug.Algorithms.Knapsack
12    
$ cat inputs/lcs.txt | java -cp "." io.github.thehappybug.Algorithms.LCS
3 4 1
```

## Results

### Modified Fibonacci

![fibonacci](http://i.imgur.com/DSDrbXU.png)

### Knapsack

![knap](http://i.imgur.com/2OUMdJk.png)

### Longest Common Subsequence

![lcs](http://i.imgur.com/YyboucX.png)
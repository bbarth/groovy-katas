package com.bb.groovy.katas

class FizzBuzz {
  String apply(num) {
    def divisibleByThree = num % 3 == 0
    def divisibleByFive = num % 5 == 0
    divisibleByFive && divisibleByThree ? 'fizzbuzz' : divisibleByThree ? 'fizz' : divisibleByFive ? 'buzz' : "${num}"
  }
}

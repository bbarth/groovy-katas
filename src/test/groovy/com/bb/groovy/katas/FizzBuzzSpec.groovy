package com.bb.groovy.katas;

import static org.junit.Assert.*
import spock.lang.Specification
import spock.lang.Unroll

class FizzBuzzSpec extends Specification {



  @Unroll("#num should return #expected")
  def "number divisible by 3 should output fizz"() {
    given:
    def sut  = new FizzBuzz();

    when:
    def result = sut.apply(num);

    then:
    result == expected

    where:
    num | expected
    3   | 'fizz'
    6   | 'fizz'
    9   | 'fizz'
  }

  @Unroll("#num should return #expected")
  def "number divisible by 5 should output buzz"() {
    given:
    def sut  = new FizzBuzz();

    when:
    def result = sut.apply(num);

    then:
    result == expected

    where:
    num | expected
    5   | 'buzz'
    10  | 'buzz'
    20  | 'buzz'
  }

  @Unroll("#num should return #expected")
  def "number divisible by 3 and 5 should output fizzbuzz"() {
    given:
    def sut  = new FizzBuzz();

    when:
    def result = sut.apply(num);

    then:
    result == expected

    where:
    num | expected
    15  | 'fizzbuzz'
    30  | 'fizzbuzz'
  }
}

package ru.netology.statistic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatisticsServiceTest {

  @Test
  void findMax() {
    StatisticsService service = new StatisticsService();

    long[] incomes = {0, 1, 2, 4, 5, 7, 8, 9, 10, 11, 12};
    long expected = 12;

    long actual = service.findMax(incomes);

    assertEquals(expected, actual);
  }
}
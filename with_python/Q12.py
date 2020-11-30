from typing import List
import random


def generate_10_numbers_from_0_until_100() -> List[int]:
    list = [random.randint(0,101) for numbers in range(10)]
    return list


def print_list(numbers: List[int]):
    for a in numbers:
        print(a)


def sort_in_ascending_order(numbers: List[int]) -> List[int]:
    sort_list = sorted(numbers)
    return sort_list


def remove_content_which_number_is_under_50(numbers: List[int]) -> List[int]:
    list = [ a for a in numbers if a > 50]
    return list


if __name__ == '__main__':
    a = generate_10_numbers_from_0_until_100()
    print_list(a)
    print(sort_in_ascending_order(a))
    print(remove_content_which_number_is_under_50(a))


class AddTwoNumbers:

    @staticmethod
    def get_unit(numberList, count):
        if count < len(numberList):
            return numberList[count]
        else:
            return 0

    @staticmethod
    def addtwonumbers(number1List, number2List):
        count = 0
        carry = 0
        result = []
        while count < len(number1List) or count < len(number2List) or carry != 0:
            unit1 = AddTwoNumbers.get_unit(number1List, count)
            unit2 = AddTwoNumbers.get_unit(number2List, count)

            resultUnit = unit1 + unit2 + carry

            if resultUnit > 10:
                resultUnit = resultUnit - 10
                carry = 1
            else:
                carry = 0

            count+= 1
            result.append(resultUnit)

        return result

    @staticmethod
    def printNumber(numberList):
        numberList.reverse()
        for unit in range(len(numberList)):
            print(numberList[unit])

if __name__ == '__main__':
    number1List = [0,0,1]
    number2List = [3,4,5,6]

    print("About to execute")
    result = AddTwoNumbers.addtwonumbers(number1List, number2List)

    print('Number 1 ')
    AddTwoNumbers.printNumber(number1List)
    print(' + Number 2 ')
    AddTwoNumbers.printNumber(number2List)
    print(' equals ')
    AddTwoNumbers.printNumber(result)









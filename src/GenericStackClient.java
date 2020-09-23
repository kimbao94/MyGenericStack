public class GenericStackClient {
    public static void main(String[] args) {
        stackOfIntegers();
        stackOfIStrings();
    }

    private static void stackOfIntegers() {
        int[] myList = {1, 2, 3, 4, 5};
        MyGenericStack<Integer> stack = new MyGenericStack<>();
        for (int k : myList) {
            stack.push(k);
        }
        for (int i = 0; i < myList.length; i++) {
            myList[i] = stack.pop();
        }
        for (int j : myList) {
            System.out.print(j);
        }
    }

    private static void stackOfIStrings() {
        MyGenericStack<String> stack = new MyGenericStack<>();
        String string = "bao dung son ngoc";
        String[] arStr = string.split(" ");
        StringBuilder output = new StringBuilder();
        for (String s : arStr) {
            stack.push(s);
        }
        for (int i = 0; i < arStr.length; i++) {
            arStr[i] = stack.pop();
        }
        for (String s : arStr) {
            output.append(s);
        }
        System.out.println(output);
    }
}


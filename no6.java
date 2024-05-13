class no6{
public static int[] deleteElement(int[] array, int index) {
    if (index < 0 || index >= array.length) {
        System.out.println("Invalid index.");
        return array;
    }

    int[] modifiedArray = new int[array.length - 1];
    int j = 0;

    for (int i = 0; i < array.length; i++) {
        if (i != index) {
            modifiedArray[j++] = array[i];
        }
    }

    return modifiedArray;
}}
public class Word {
    char[] characters;
    int length;

    Word() {
        characters = new char[100];
        length = 0;
    }

    public void addCharacter(char character) {
        if(length == characters.length) {
            throw new IndexOutOfBoundsException();
        }
        characters[length] = character;
        length++;
    }

    public void print() {
        for(int i = 0; i < length; ++i) {
            System.out.print(characters[i]);
        }
        System.out.println();
    }

    public int length() {
        return length;
    }
}
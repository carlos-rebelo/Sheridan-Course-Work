package zzzencryptor;

public class SubstitutionEngine implements Encryptor {

    @Override
    public String encrypt(String sentence)
    {
        sentence = sentence.replace('t', '!');
        sentence = sentence.replace('e', '#');
        sentence = sentence.replace('a', '~');
        sentence = sentence.replace('o', '%');
        sentence = sentence.replace('g', '&');
        sentence = sentence.replace('y', '*');
        sentence = sentence.replace('h', '(');
        sentence = sentence.replace('i', ')');
        sentence = sentence.replace('b', '_');

        return sentence;
    }

    @Override
    public String decrypt(String sentence)
    {
        sentence = sentence.replace('!', 't');
        sentence = sentence.replace('#', 'e');
        sentence = sentence.replace('~', 'a');
        sentence = sentence.replace('%', 'o');
        sentence = sentence.replace('&', 'g');
        sentence = sentence.replace('*', 'y');
        sentence = sentence.replace('(', 'h');
        sentence = sentence.replace(')', 'i');
        sentence = sentence.replace('_', 'b');

        return sentence;
    }

}

public class CesarDecoder {
    private static final String encryptedText = "Еъёчхф Вхзёюлх, адздёиу ф ждэщхб, црбх еёдюэчъщъгюъв" +
            " южаижжзчх, ждчъёнъгжзчдв. Ъы зёюивй жёхчгюв бюнс ж ъы " +
            "вдгивъгзхбсгрв аёхкдв. Зъеъёс вгъ дмъчющгд, мзд гъюэцъьгджзс" +
            " тздшд аёхкх фчбфъзжф жбъщжзчюъв гъждчъёнъгжзчх " + "мъбдчъмъжадшд югщючющиивх. Ф юэимюб" +
            " чхни южздёюу ю чгыж юэвъгъгюф, здмгъъ дзёхэюч еджздфггиу юэвъгмючджзс " + "мъбдчъмъжаюк едёдадч. " +
            "Ю зъв гъ въгъъ, еджбъщдчхбх гъищхмх. Ф еёюнъб а чрчдщи, мзд чюгдя чжъви вдя югзъббъаз, х чдэвдьгд, " +
            "вды мёъэвъёгдъ жзёъвбъгюъ ад чжъви шхёвдгюмгдви. Гхязю ёънъгюъ вгъ едвдшбх " +
            "еёдшёхввх югзиюзючгдшд зюех, жеълюхбсгд " + "ждэщхггхф щбф юэимъгюф деёъщъбъггрк жздёдг мъбдчъмъжадя щиню." +
            " Въгф вдьгд гхэчхзс дзлдв Вхзёюлр, х ъы, цъэ " + "еёъичъбюмъгюф, вхзъёсу.";


    public String decode(String text) {
        char[] charArrayEncoded = text.toCharArray();
        char[] charArrayDecoded = new char[charArrayEncoded.length];
        for (int j = 0; j < charArrayEncoded.length; j++) {
            if (charArrayEncoded[j] == 32) {
                charArrayDecoded[j] = charArrayEncoded[j];
            } else if (charArrayEncoded[j] == 46){
                charArrayDecoded[j] = charArrayEncoded[j];
            } else if (charArrayEncoded[j] == 44){
                charArrayDecoded[j] = charArrayEncoded[j];
            } else if (charArrayEncoded[j] == 'я') {
                charArrayDecoded[j] = 'а';
            } else if (charArrayEncoded[j] == 'Я') {
                charArrayDecoded[j] = 'А';
            } else if (charArrayEncoded[j] == 'ё') {
                charArrayDecoded[j] = 'ж';
            } else if (charArrayEncoded[j] == 'Ё') {
                charArrayDecoded[j] = 'Ж';
            }  else if (charArrayEncoded[j] == 'е') {
                charArrayDecoded[j] = 'ё';
            } else if (charArrayEncoded[j] == 'Е') {
                charArrayDecoded[j] = 'Ё';
            } else if (charArrayEncoded[j] == 'ъ') {
                charArrayDecoded[j] = 'ы';
            } else if (charArrayEncoded[j] == 'Ъ') {
                charArrayDecoded[j] = 'Ы';
            } else if (charArrayEncoded[j] == 'ь') {
                charArrayDecoded[j] = 'э';
            } else if (charArrayEncoded[j] == 'Ь') {
                charArrayDecoded[j] = 'Э';
            } else if (charArrayEncoded[j] == 'ы') {
                charArrayDecoded[j] = 'ь';
            } else if (charArrayEncoded[j] == 'Ы') {
                charArrayDecoded[j] = 'Ь';
            } else if (charArrayEncoded[j] == 'щ') {
                charArrayDecoded[j] = 'ъ';
            } else if (charArrayEncoded[j] == 'Щ') {
                charArrayDecoded[j] = 'Ъ';
            } else {
                charArrayDecoded[j] = (char) (charArrayEncoded[j] + 1);
            }
        }

        return new String(charArrayDecoded);
    }

    public static void main(String[] args) {
        CesarDecoder decoder = new CesarDecoder();
        String probablyDecoded = encryptedText;
        System.out.println(probablyDecoded);
        for (int i = 0; i < 33; i++) {
            probablyDecoded = decoder.decode(probablyDecoded);
            System.out.println(probablyDecoded);
        }

        System.out.println("Сдвиг вправо равен 11");

    }
}

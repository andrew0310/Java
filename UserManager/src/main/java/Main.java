import FileOperator.BufferedWriterFileOperator;
import FileOperator.FieldNamedParametersLineGenerator;
import UserManagement.User;
import UserManagement.UserManager;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        User arek = new User("Arkadiusz", "Pucybut", "arek.wladca@wp.pl", "arkadiusz.pucybut", "arek123", 0001);
        User krzysiek = new User("Krzysztof", "Jaskólski", "krzysiu.jemzupe@gmail.com", "krzysztof.jaskolski", "456krzysiu", 0002);
        User malgosia = new User("Małgorzata", "Szustkiewicz", "malgosia.dlugaa@interia.pl", "malgorzata.szustkiewicz", "malgoska1221", 0003);
        User krysia = new User("Krystyna", "Kowalska", "krystynazgazowni@onet.pl", "krystyna.kowalska", "jajestemkryska001", 0004);
        User kasia = new User("Katarzyna", "Gołdyn", "kaska.goldyn@o2.pl", "katarzyna.goldyn", "kasiadzisiaj154", 0005);
        User robert = new User("Robert", "Białkowski", "robert.bialkowski@gmail.com", "robert.bialkowski", "robcio1990", 0006);
        User john = new User("John", "English", "johny.englishxxx@mi6.co.uk", "john.english", "johnyenglish121", 0007);
        User vladimir = new User("Vladimir", "Putin", "vladimir.putin@rt.ru", "vladimir.putin", "wladekzrossiji1", 0011);
        User marta = new User("Marta", "Zbielska", "zmartka@o2.pl", "marta.zbielska", "martunianumerouno111", 0012);
        User andrzej = new User("Andrzej", "Kraszewski", "andrzej@kraszewski.hub.pl", "andrzej.kraszewski", "andrew007", 0010);

        UserManager userManager = new UserManager(new FieldNamedParametersLineGenerator(), new BufferedWriterFileOperator());

        userManager.register(arek);
        userManager.register(krzysiek);
        userManager.register(malgosia);
        userManager.register(krysia);
        userManager.register(kasia);
        userManager.register(robert);
        userManager.register(john);
        userManager.register(vladimir);
        userManager.register(marta);
        userManager.register(andrzej);

        UserManager list = new UserManager(new ArrayList<User>());
        list.register(arek);
        list.register(krzysiek);
        list.register(malgosia);
        list.register(krysia);
        list.register(kasia);
        list.register(robert);
        list.register(john);
        list.register(vladimir);
        list.register(marta);
        list.register(andrzej);
        list.save();

    }
}

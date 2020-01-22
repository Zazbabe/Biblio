package com.company;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Library {
    ArrayList<Book> bookArray = new ArrayList<>();
    ArrayList<User> userArray = new ArrayList<>();

    public Library() {

//Instantiating and adding user to userArray
        userArray.add(new User("Kalle", "kalle@kalle.com", "Kalle1"));
        System.out.println(userArray.get(0));
        userArray.add(new User("Pelle", "pelle@pelle.com", "Pelle1"));
        System.out.println(userArray.get(1));

        //byt ut böckerna till mina egna valda - ta sen bort denna kommentaren (topplistan från Bokus)
        bookArray.add(new Book("Månsystern : Tiggys bok", "Lucinda Riley", "Månsystern är den femte delen i succéserien De sju systrarna som har förtrollat en hel värld."));
        bookArray.add(new Book("Klubben", "Matilda Gustavsson", "I årtionden hade han omgetts av rykten om övergrepp - den välkände kulturprofilen vars prestigefulla klubb drog till sig medlemmar ur Svenska Akademien, och där konstnärskap både föddes och dog. Den 22 november 2017 publicerades journalisten Matilda Gustavssons reportage om kulturprofilen i Dagens Nyheter, där arton kvinnor vittnade om våldtäkter, hot och trakasserier. Det inledde en händelsekedja som skulle få en av världens mest anrika kulturinstitutioner att krackelera inför öppen ridå."));
        bookArray.add(new Book("Förövarna", "Nora Roberts", "På ytan framstår Bigelows som den perfekta familjen. Men bakom stängda dörrar lever barnen Zane och Britt i ständig terror. De har lärt sig att dölja fadern Grahams våldsamma beteende för omvärlden. Ända till den dag då fjortonåriga Zane för första gången vågar säga emot."));
        bookArray.add(new Book("Pärlsystern : Ceces bok", "Lucinda Riley", "Pärlsystern är den fjärde delen i en storslagen serie om familj, kärlek och identitet, som baseras på legenden om stjärnkonstellationen Plejaderna. Den konstnärliga CeCe har alltid känt sig vilsen. Efter att hennes adoptivfar gått bort står hon ensam kvar utan sin ständiga skugga, systern Star. Innan han dog efterlämnade fadern ledtrådar till CeCe och hennes fem systrar, pusselbitar som skulle hjälpa dem att finna sina rötter. CeCes ledtråd för henne till Australien, där den skotska prästdottern Kitty McBride hundra år tidigare fann kärleken och blev en framgångsrik pärlfiskare.Hur hänger deras liv samman? Och hur ska CeCe någonsin kunna hitta hem och acceptera sig själv som den hon är?"));
        bookArray.add(new Book("Bellman : biografin", "Carina Burman", "Staden myllrade omkring honom. Vattenkuskar, soldater och pigor trängdes med grevinnor, tullsnokar och notarier, solen blänkte i kyrkspiror och sabelfästen. Vart man gick anade man hamnens närvaro med saltlukt, höga master och främmande språk. Skalden Carl Michael Bellman (1740-1795) lämnade sällan Stockholm. Men han var en gudabenådad poet, och i sin märkliga sångsamling Fredmans epistlar skapade han en hel värld."));
        bookArray.add(new Book("De sju systrarna : Maias bok", "Lucinda Riley", "De sju systrarna är den första delen i en storslagen serie om familj, kärlek och identitet, som baseras på legenden om stjärnkonstellationen Plejaderna. Maia D Aplièse har länge isolerat sig i sitt barndomshem, det vackra slottet Atlantis vid Genèvesjön. Men efter att hennes adoptivfar hastigt går bort förändras allt. När hennes fem systrar kommer hem för att ta farväl av fadern får de alla varsin ledtråd, en pusselbit som ska hjälpa dem att finna sina rötter. Maias ledtråd för henne till en förfallen herrgård i Rio de Janeiro, där den äventyrslystna Izabela Bonifacio levde åttio år tidigare."));
        bookArray.add(new Book("Stormsystern : Allys bok", "Lucinda Riley", "Stormsystern är den andra delen i en storslagen serie om familj, kärlek och identitet, som baseras på legenden om stjärnkonstellationen Plejaderna. Den framgångsrika seglaren Ally D Aplièse återvänder till sitt barndomshem när hon nås av nyheten om sin adoptivfars hastiga bortgång. Där tilldelas hon och hennes fem systrar varsin ledtråd som fadern efterlämnat. En pusselbit som ska hjälpa dem att finna sina rötter Ally reser till Norge, och där upptäcker hon en etthundra år gammal historia om en sångerska som inte bara har kopplingar till kompositören Edvard Grieg, utan också till henne själv. Ju mer Ally lär sig om Anna, desto mer förstår hon om sitt förflutna."));
        bookArray.add(new Book("Skuggsystern : Stars bok", "Ludinca Riley", "Skuggsystern är den tredje delen i en storslagen serie om familj, kärlek och identitet, som baseras på legenden om stjärnkonstellationen Plejaderna. Star D'Aplièse står vid ett vägskäl efter hennes adoptivfars hastiga död. Han efterlämnade varsin ledtråd till Star och hennes fem systrar, en pusselbit som skulle hjälpa dem att finna sina rötter. Ett antikvariat i London blir första steget på Stars resa. Hon får nya vänner och inser att hon har kopplingar till en kvinna vid namn Flora MacNichol, som etthundra år tidigare slets mellan passionerad kärlek och sina plikter mot familjen. Floras otroliga livshistoria förändrar Star. Hon kan äntligen stiga ur sin syster CeCes skugga och öppna sitt hjärta för kärleken."));
        bookArray.add(new Book("Löparna", "Olga Tokarczuk", "Frédéric Chopins syster smugglar hans konserverade hjärta över gränsen till Polen. En kvinna flyger över halva jordklotet med uppdraget att barmhärtighetsmörda sin dödssjuka tonårskärlek. En man sjunker långsamt ned i galenskap efter att hans fru och barn mystiskt försvunnit under en semesterresa, för att sedan lika mystiskt dyka upp igen. Den ryska sekten Löparna förkunnar att vägen till frälsning ligger i att aldrig slå sig till ro."));
        bookArray.add(new Book("Min fantastiska väninna. Bok 1, Barndom och tonår", "Elena Ferrante", "I en hyreskasern nära landsvägen i femtiotalets Neapel växer de båda flickorna Elena Greco och Lila Cerrullo upp och blir vänner för livet. Det är efterkrigstid, nödår och våldet präglar fortfarande Italien i form av lönnmord och godtyckliga avrättningar. Lila är den självklara ledaren, den snabbfotade, den våghalsiga, den kvicktänka och den elaka. Det är också Lila som slår Elena ur brädet som skolans bästa elev, hon har lärt sig läsa själv och kommer etta på alla prov. Skolgången utgör ett löfte om en bättre framtid för dem båda, men Lila, dotter till skomakaren Fernando och hans hustru som båda är analfabeter, är den som tvingas ge upp studierna medan Elenas far, som är vaktmästare i stadshuset, ser till att dottern får fortsätta att gå i skolan."));

        writeBooklist();
        searchByName();
        searchByWriter();
        lendingBook();
    }

    //utanför konstruktor

    //loopar Arraylistan för att skriva ut varje bok
    private void writeBooklist() {
        for (Book book : bookArray) {
            System.out.println(book);
        }
    }

    //söker på boktitel - är sorterad enligt boktitel nu
    private void searchByName() {
        bookArray.sort((book1, book2) -> book1.getName().compareTo(book2.getName()));
        System.out.println(bookArray);
    }

    //söker på Författare - är sorterad enligt Författare nu... snart
    private void searchByWriter() {
        bookArray.sort((book1, book2) -> book1.getWriter().compareTo(book2.getWriter()));
        System.out.println(bookArray);
    }

    //Hårdkodad utlåning nedan - Scanner i senare skede
    private void unusedMethod() {
        //Kalle lånar en bok
        userArray.get(0).borrowBook(bookArray.get(0));
        bookArray.get(0).setAvailable(false);

        //Kalle lånar en bok till
        userArray.get(0).borrowBook(bookArray.get(1));
        bookArray.get(0).setAvailable(false);

        //Skriver ut vilka böcker Kalle lånat
        userArray.get(0).myBorrowedBooks();
        userArray.get(0).returnBook(bookArray.get(0));

        //skriver ut vilka böcker Kalle har kvar som lånade
        userArray.get(0).myBorrowedBooks();
    }

    //Scanner - input från användare
    //Frågar användaren om input
    private void lendingBook() {
        //Får in vilken bok och lånar denna till användaren
        Scanner in = new Scanner(System.in);
        int booknumber = in.nextInt();
        do {
            System.out.println("Vilken bok vill du låna? Välj en av böckerna nedan genom att ange numret på boken.");
            try {
                //hantera exceptions Boken är redan utlånad & numret är out of range/bounce
                if (booknumber > bookArray.size()) {
                    System.out.println("ERROR: Numret finns inte i listan. Försök igen!");
                }
                if (bookArray.get(booknumber - 1).getAvailability() == false) {
                    System.out.println("ERROR: Boken är redan utlånad och går ej att låna just nu!");
                }
            } catch (Exception e) {
                System.out.println("Oj, nu blev något tokigt! Kontakta supporten eller försök igen!");
            } finally {
                System.out.println("The 'try catch' is finished.");
            }
        } while (!bookArray.get(booknumber).getAvailability() == true);
                //Skriv ut och verifiera att boken är lånad
                System.out.println("Nu har du lånat boken.");


    }
}
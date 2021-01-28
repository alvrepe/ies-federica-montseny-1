package org.iesfm.library;

public interface ILibrary {
    void showBooks();

    void showBooksByGenre(String genre);

    void showMember();

    void showMembersByCp(int cp);

    void showMembersLends(String nif);

    void showMemberLends(int numMember);

    boolean memberHasLend(int numMember, int isbn);


}

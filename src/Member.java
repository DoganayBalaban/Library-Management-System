/* DOĞANAY BALABAN 1220505057 */

public class Member {
    /* Tutulması gereken fieldlar */
    private Integer memberID;
    private String memberName;
    private Integer memberAge;

    /* Yapıcı metot */
    Member(Integer memberID, String memberName, Integer memberAge) {
        this.memberID = memberID;
        this.memberName = memberName;
        this.memberAge = memberAge;
    }

    /* Encapsulate işlemi */
    public Integer getMemberID() {
        return memberID;
    }

    public void setMemberID(Integer memberID) {
        this.memberID = memberID;
    }

    public String getMemberName() {
        return memberName;
    }

    public Integer getMemberAge() {
        return memberAge;
    }


}

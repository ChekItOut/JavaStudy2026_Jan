package b_ImmutableObject;

public class ImmutableMyDate {
    private final int year;
    private final int month;
    private final int day;

    public ImmutableMyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    //불변객체의 값을 변경할 때 내부 값을 변경하는 것이 아닌 변경된 값을 가진 새로운 객체를 리턴한다.

    //year만 변경하고 나머지는 유지한 새로운 객체를 리턴
    public ImmutableMyDate withYear(int year) {
        return new ImmutableMyDate(year, month, day);
    }

    //month만 변경하고 나머지는 유지한 새로운 객체를 리턴
    public ImmutableMyDate withMonth(int month) {
        return new ImmutableMyDate(year, month, day);
    }

    //day만 변경하고 나머지는 유지한 새로운 객체를 리턴
    public ImmutableMyDate withDay(int day) {
        return new ImmutableMyDate(year, month, day);
    }

    @Override
    public String toString() {
        return year + "-" + month + "-" + day;
    }
}

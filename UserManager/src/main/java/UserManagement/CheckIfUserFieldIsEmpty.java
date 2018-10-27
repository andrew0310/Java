package UserManagement;

public class CheckIfUserFieldIsEmpty implements CheckingField {

    @Override
    public boolean fieldIsNotOk(String checkedText) {
        return (checkedText == null || checkedText.isEmpty());
    }

    @Override
    public boolean fieldIsNotOk(int number) {
        return number != 0;
    }
}

package snacks.UndoStringBuilder;
import java.util.ArrayList;

public class UndoStringBuilderImpl implements UndoStringBuilderInter {
    private StringBuilder stringBuilder;
    private ArrayList<StringBuilder> operation;
    public UndoStringBuilderImpl() {
        this.stringBuilder = new StringBuilder();
        this.operation = new ArrayList<>();
        operation.add(new StringBuilder(toString()));
    }

    public UndoStringBuilderImpl(String str) {
        this.stringBuilder = new StringBuilder(str);
        this.operation = new ArrayList<>();
        operation.add(new StringBuilder(stringBuilder.toString()));
    }

    @Override
    public StringBuilder append(String str) {
        stringBuilder.append(str);
        operation.add(new StringBuilder(stringBuilder.toString()));
        return stringBuilder;
    }

    @Override
    public StringBuilder replace(int start, int stop, String str) {
        if (start >= 0 && start <= stop && stop <= stringBuilder.length()) {
            stringBuilder.replace(start, stop, str);
            operation.add(new StringBuilder(stringBuilder.toString()));
        } else {
            throw new IllegalArgumentException("Index out of bound.");
        }
        return stringBuilder;
    }

    @Override
    public StringBuilder delete(int start, int end) {
        if (start >= 0 && start <= end && end <= stringBuilder.length()) {
            stringBuilder.delete(start, end);
            operation.add(new StringBuilder(stringBuilder.toString()));
        } else {
            throw new IllegalArgumentException("Invalid start and end indices for delete operation.");
        }

        return stringBuilder;
        }


    @Override
    public StringBuilder reverse() {
        stringBuilder.reverse();
        operation.add(new StringBuilder(stringBuilder.toString()));
        return stringBuilder;
    }

    @Override
    public StringBuilder insert(int offset, String str) {
        if (offset >= 0) {
            stringBuilder.insert(offset, str);
            operation.add(new StringBuilder(stringBuilder.toString()));
        } else {
            throw new IllegalArgumentException("Offset can not be less than 0");
        }
        return stringBuilder;
    }


    @Override
    public StringBuilder undo() {
        if (!operation.isEmpty() && operation.size() > 1) {
            operation.clear();
            String previousState = String.valueOf(operation);
            stringBuilder = new StringBuilder(previousState);
        }
        return stringBuilder;


    }

    public String toString(){return stringBuilder.toString();}
}

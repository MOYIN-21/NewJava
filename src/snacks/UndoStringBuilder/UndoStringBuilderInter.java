package snacks.UndoStringBuilder;

public interface UndoStringBuilderInter {
    StringBuilder append(String append);
    StringBuilder replace(int start, int stop, String str);
    StringBuilder delete(int start, int end);
    StringBuilder reverse();
    StringBuilder insert(int offset, String str);
    StringBuilder undo();
}

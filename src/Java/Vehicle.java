public interface Vehicle {
    String getId();
    Position getCurrentPosition();
    void assignTask(Task task);
}

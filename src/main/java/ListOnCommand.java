public class ListOnCommand extends Command {
    private String input;

    public ListOnCommand(String input) {
        this.input = input;
    }
    @Override
    public void execute(TaskList tasks, Ui ui, Storage storage) {
        tasks.listTasksOnDate(input, ui);
    }
}

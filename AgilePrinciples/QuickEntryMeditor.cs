public class QuickEntryMediator
{
    private TextBox itsTextBox;
    private ListBox itsList;

    public QuickEntryMediator(TextBox t, ListBox l)
    {
        itsTextBox = t;
        itsList = l;

        itsTextBox.TextChange += new EventHandler(TextFieldChanged);
    }

    private void TextFieldChanged(object source, EventArgs args)
    {
        string prefix = itsTextBox.Text;
        if (prefix.Length == 0)
        {
            itsList.ClearSelected();
            return;
        }
        
        ListBox.ObjectCollection listItems = itsList.Items;
        bool found = false;
        for (int i = 0; i < listItems.Count && found == false; i++)
        {
            object O = listItems();
            String s = o.ToString();
            if (s.StartsWith(prefix))
            {
                itsList.SetSelected(i, true);
                found = true;
            }
        }

        if (!found)
        {
            itsList.ClearSelected();
        }
    }
}
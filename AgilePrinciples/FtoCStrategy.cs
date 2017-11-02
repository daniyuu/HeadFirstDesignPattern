using System;
using System.IO;

public interface Application
{
    void Init();
    void Idle();
    void Cleanup();
    bool Done();
}

public class ApplicationRunner
{
    private Application itsApplication = null;
    public ApplicationRunner(Application app)
    {
        itsApplication = app;
    }

    public void run()
    {
        itsApplication.Init();
        while (!itsApplication.Done())
        {
            itsApplication.Idle();
        }
        itsApplication.Cleanup();
    }
}

public class FtoCStrategy: Application
{
    private TextReader input;
    private TextWriter output;
    private bool isDone = false;

    public static void Main(string[] args)
    {
        (new ApplicationRunner(new FtoCStrategy())).run();
    }

    public void Init()
    {
        input = Console.In;
        output = Console.Out;
    }

    public void Idle()
    {
        string fathrString = input.ReadLine();
        if (fathrString == null || fathrString.Length == 0) {
            isDone = true;
        } else {
            double fahr = Double.Parse(fathrString);
            double celcius = 5.0/9.0 * (fahr - 32);
            output.WriteLine("F={0}, C={1}", fahr, celcius);
        }
    }

    public void Cleanup()
    {
        output.WriteLine("ftoc exit");
    }

    public bool Done()
    {
        return isDone;
    }
}
using System;
using System.IO;

public abstract class Application 
{
    private bool isDone = false;

    protected abstract void Init();
    protected abstract void Idle();
    protected abstract void Cleanup();

    protected void SetDone()
    {
        isDone = true;
    }

    protected bool Done() {
        return isDone;
    }

    public void Run() {
        Init();
        while (!Done())
        {
            Idle();
        }
        
        Cleanup();
    }
}


public class FtoCTemplateMethod: Application {
    private TextReader input;
    private TextWriter output;

    public static void Main(string[] args) {
        new FtoCTemplateMethod().Run();
    } 

    protected override void Init() {
        input = Console.In;
        output = Console.Out;
    }

    protected override void Idle() {
        string fathrString = input.ReadLine();
        if (fathrString == null || fathrString.Length == 0) {
            SetDown();
        } else {
            double fahr = Double.Parse(fathrString);
            double celcius = 5.0/9.0 * (fahr - 32);
            output.WriteLine("F={0}, C={1}", fahr, celcius);
        }
    }

    protected override void Cleanup() {
        output.WriteLine("ftoc exit");
    }
}
package com.company;
import java.util.Stack;

public class TreinStation {

    private Stack<Nameable> station = new Stack<Nameable>();

    public void rijdtBinnen(Trein trein) {
        leegTrein(trein);
        vulTrein(trein);

    }

    private void leegTrein(Trein trein) {


        for (String name : trein.getNames()) {
            Nameable uitgestapte = trein.uitstappen(name);
            station.push(uitgestapte);
        }
    }

    private void vulTrein(Trein trein) {
        while (!station.isEmpty()) {
            Nameable opgestapelde = station.pop();
            trein.instappen(opgestapelde);
        }
    }
}

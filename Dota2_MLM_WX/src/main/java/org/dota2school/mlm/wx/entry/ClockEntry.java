package org.dota2school.mlm.wx.entry;

import org.dota2school.mlm.wx.domain.Clock;
import org.dota2school.mlm.wx.model.SuccessEntry;

public class ClockEntry  extends SuccessEntry{

    private Clock punchCard;

    public ClockEntry(Clock clock){
        this.punchCard = clock;
    }

    public Clock getPunchCard() {
        return punchCard;
    }

    public void setPunchCard(Clock punchCard) {
        this.punchCard = punchCard;
    }
}

package net.nishant.journalApplication.controller;

import net.nishant.journalApplication.entity.JournalEntry;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/journal")
public class JournalEntryController {
    private final Map<Long, JournalEntry> journalEntries = new HashMap<>();

    @GetMapping
    public List<JournalEntry> getAll() { //localhost:8080/journal GET
        return new ArrayList<>(journalEntries.values());
    }
    @GetMapping("/{myId}")
    public JournalEntry getEntryId(@PathVariable Long myId) { //localhost:8080/journal/id/ID GET
        return journalEntries.get(myId);
    }


    @GetMapping("/id/{myId}")
    public JournalEntry getJournalEntryId(@PathVariable Long myId) { //localhost:8080/journal/id/ID GET
        return journalEntries.get(myId);
    }

    @PostMapping
    public boolean createEntry(@RequestBody JournalEntry MyEntry){ // localhost:8080/journal POST
        journalEntries.put(MyEntry.getId(),MyEntry);
        return true;

    }

    @DeleteMapping("/id/{myId}")
    public JournalEntry DeleteJournalEntryId(@PathVariable Long myId) { //localhost:8080/journal/id/ID GET
        return journalEntries.remove(myId);
    }

    @PutMapping("/id/{myId}")
    public JournalEntry updateJournalById(@PathVariable Long myId , @RequestBody JournalEntry MyEntry){
        return journalEntries.put(myId,MyEntry);
    }

}

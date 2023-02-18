package seedu.address.model.entity.person;

import seedu.address.model.tag.Tag;

import java.util.Set;

public class Technician extends Staff {
    /**
     * {@inheritDoc}
     */
    public Technician(Name name, Phone phone, Email email, Address address, Set<Tag> tags) {
        super(name, phone, email, address, tags);
    }
}

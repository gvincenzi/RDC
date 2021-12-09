package org.rdc.node.service;

import org.rdc.node.binding.message.entity.Document;
import org.rdc.node.binding.message.entity.Participant;
import org.rdc.node.exception.RDCNodeException;
import org.rdc.node.item.RDCItem;

public interface IRDCItemService {
	RDCItem add(Document document, Participant owner) throws RDCNodeException;
	Boolean validate(Iterable<RDCItem> items, Participant validator) throws RDCNodeException;
}

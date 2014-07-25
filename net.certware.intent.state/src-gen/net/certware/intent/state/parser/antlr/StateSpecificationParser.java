/*
* generated by Xtext
*/
package net.certware.intent.state.parser.antlr;

import net.certware.intent.state.services.StateSpecificationGrammarAccess;

import org.eclipse.xtext.parser.antlr.XtextTokenStream;

import com.google.inject.Inject;

public class StateSpecificationParser extends org.eclipse.xtext.parser.antlr.AbstractAntlrParser {
	
	@Inject
	private StateSpecificationGrammarAccess grammarAccess;
	
	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	
	@Override
	protected net.certware.intent.state.parser.antlr.internal.InternalStateSpecificationParser createParser(XtextTokenStream stream) {
		return new net.certware.intent.state.parser.antlr.internal.InternalStateSpecificationParser(stream, getGrammarAccess());
	}
	
	@Override 
	protected String getDefaultRuleName() {
		return "Specification";
	}
	
	public StateSpecificationGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(StateSpecificationGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
}
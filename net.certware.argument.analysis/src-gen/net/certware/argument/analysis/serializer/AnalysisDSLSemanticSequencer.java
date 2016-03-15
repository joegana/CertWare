/*
 * generated by Xtext
 */
package net.certware.argument.analysis.serializer;

import com.google.inject.Inject;
import java.util.Set;
import net.certware.argument.analysis.analysisDSL.AnalysisDSLPackage;
import net.certware.argument.analysis.analysisDSL.Atom;
import net.certware.argument.analysis.analysisDSL.ClassicLiteral;
import net.certware.argument.analysis.analysisDSL.Line;
import net.certware.argument.analysis.analysisDSL.Output;
import net.certware.argument.analysis.analysisDSL.Term;
import net.certware.argument.analysis.analysisDSL.Terms;
import net.certware.argument.analysis.services.AnalysisDSLGrammarAccess;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;

@SuppressWarnings("all")
public class AnalysisDSLSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private AnalysisDSLGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == AnalysisDSLPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case AnalysisDSLPackage.ATOM:
				sequence_Atom(context, (Atom) semanticObject); 
				return; 
			case AnalysisDSLPackage.CLASSIC_LITERAL:
				sequence_ClassicLiteral(context, (ClassicLiteral) semanticObject); 
				return; 
			case AnalysisDSLPackage.LINE:
				sequence_Line(context, (Line) semanticObject); 
				return; 
			case AnalysisDSLPackage.OUTPUT:
				sequence_Output(context, (Output) semanticObject); 
				return; 
			case AnalysisDSLPackage.TERM:
				sequence_Term(context, (Term) semanticObject); 
				return; 
			case AnalysisDSLPackage.TERMS:
				sequence_Terms(context, (Terms) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     Atom returns Atom
	 *
	 * Constraint:
	 *     (name=PREDICATE_NAME terms=Terms?)
	 */
	protected void sequence_Atom(ISerializationContext context, Atom semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ClassicLiteral returns ClassicLiteral
	 *
	 * Constraint:
	 *     (neg='-'? atom=Atom)
	 */
	protected void sequence_ClassicLiteral(ISerializationContext context, ClassicLiteral semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Line returns Line
	 *
	 * Constraint:
	 *     items+=ClassicLiteral+
	 */
	protected void sequence_Line(ISerializationContext context, Line semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Output returns Output
	 *
	 * Constraint:
	 *     lines+=Line+
	 */
	protected void sequence_Output(ISerializationContext context, Output semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Term returns Term
	 *
	 * Constraint:
	 *     (cs=CONSTANT_SYMBOL | (sign='-'? n=NUMBER) | (fs=FUNCTIONAL_SYMBOL terms=Terms))
	 */
	protected void sequence_Term(ISerializationContext context, Term semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Terms returns Terms
	 *
	 * Constraint:
	 *     (car=Term cdr+=Term*)
	 */
	protected void sequence_Terms(ISerializationContext context, Terms semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}
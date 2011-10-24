/**
 * Generated with Acceleo
 */
package net.certware.measurement.sco.components;

// Start of user code for imports
import net.certware.measurement.sco.ChangeOrderType;
import net.certware.measurement.sco.ImprovementChangeOrders;
import net.certware.measurement.sco.ScoPackage;
import net.certware.measurement.sco.parts.ImprovementChangeOrdersPropertiesEditionPart;
import net.certware.measurement.sco.parts.ScoViewsRepository;

import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.common.command.IdentityCommand;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.emf.common.util.WrappedException;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.emf.ecore.util.EContentAdapter;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.eef.runtime.EEFRuntimePlugin;
import org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent;
import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionListener;
import org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart;
import org.eclipse.emf.eef.runtime.api.providers.IPropertiesEditionPartProvider;
import org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent;
import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.impl.notify.PropertiesValidationEditionEvent;
import org.eclipse.emf.eef.runtime.impl.services.PropertiesEditionPartProviderService;
import org.eclipse.emf.eef.runtime.impl.utils.EEFConverterUtil;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.PlatformUI;
	

// End of user code

/**
 * @author mrb
 * 
 */
public class ImprovementChangeOrdersPropertiesEditionComponent extends StandardPropertiesEditionComponent {

	
	public static String BASE_PART = "Base"; //$NON-NLS-1$

	
	private String[] parts = {BASE_PART};

	/**
	 * The EObject to edit
	 * 
	 */
	private ImprovementChangeOrders improvementChangeOrders;

	/**
	 * The Base part
	 * 
	 */
	protected ImprovementChangeOrdersPropertiesEditionPart basePart;

	/**
	 * Default constructor
	 * 
	 */
	public ImprovementChangeOrdersPropertiesEditionComponent(EObject improvementChangeOrders, String editing_mode) {
		if (improvementChangeOrders instanceof ImprovementChangeOrders) {
			this.improvementChangeOrders = (ImprovementChangeOrders)improvementChangeOrders;
			if (IPropertiesEditionComponent.LIVE_MODE.equals(editing_mode)) {
				semanticAdapter = initializeSemanticAdapter();
				this.improvementChangeOrders.eAdapters().add(semanticAdapter);
			}
		}
		this.editing_mode = editing_mode;
	}

	/**
	 * Initialize the semantic model listener for live editing mode
	 * 
	 * @return the semantic model listener
	 * 
	 */
	private AdapterImpl initializeSemanticAdapter() {
		return new EContentAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.emf.common.notify.impl.AdapterImpl#notifyChanged(org.eclipse.emf.common.notify.Notification)
			 * 
			 */
			public void notifyChanged(final Notification msg) {
				if (basePart == null)
					ImprovementChangeOrdersPropertiesEditionComponent.this.dispose();
				else {
					Runnable updateRunnable = new Runnable() {
						public void run() {
							runUpdateRunnable(msg);
						}
					};
					if (null == Display.getCurrent()) {
						PlatformUI.getWorkbench().getDisplay().syncExec(updateRunnable);
					} else {
						updateRunnable.run();
					}
				}
			}

		};
	}

	/**
	 * Used to update the views
	 * 
	 */
	protected void runUpdateRunnable(final Notification msg) {
		if (ScoPackage.eINSTANCE.getChangeOrderCount_Name().equals(msg.getFeature()) && basePart != null){
			if (msg.getNewValue() != null) {
				basePart.setName(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEString(), msg.getNewValue()));
			} else {
				basePart.setName("");
			}
		}
		if (ScoPackage.eINSTANCE.getChangeOrderCount_Value().equals(msg.getFeature()) && basePart != null){
			if (msg.getNewValue() != null) {
				basePart.setValue(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEInt(), msg.getNewValue()));
			} else {
				basePart.setValue("");
			}
		}
		if (ScoPackage.eINSTANCE.getChangeOrderCount_Type().equals(msg.getFeature()) && basePart != null)
			basePart.setType((Enumerator)msg.getNewValue());

		if (ScoPackage.eINSTANCE.getChangeOrderCount_BrokenLines().equals(msg.getFeature()) && basePart != null){
			if (msg.getNewValue() != null) {
				basePart.setBrokenLines(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEInt(), msg.getNewValue()));
			} else {
				basePart.setBrokenLines("");
			}
		}
		if (ScoPackage.eINSTANCE.getChangeOrderCount_FixedLines().equals(msg.getFeature()) && basePart != null){
			if (msg.getNewValue() != null) {
				basePart.setFixedLines(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEInt(), msg.getNewValue()));
			} else {
				basePart.setFixedLines("");
			}
		}
		if (ScoPackage.eINSTANCE.getChangeOrderCount_RepairEffort().equals(msg.getFeature()) && basePart != null){
			if (msg.getNewValue() != null) {
				basePart.setRepairEffort(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEDouble(), msg.getNewValue()));
			} else {
				basePart.setRepairEffort("");
			}
		}

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#translatePart(java.lang.String)
	 * 
	 */
	public java.lang.Class translatePart(String key) {
		if (BASE_PART.equals(key))
			return ScoViewsRepository.ImprovementChangeOrders.class;
		return super.translatePart(key);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent#partsList()
	 * 
	 */
	public String[] partsList() {
		return parts;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent#getPropertiesEditionPart
	 *  (java.lang.String, java.lang.String)
	 * 
	 */
	public IPropertiesEditionPart getPropertiesEditionPart(int kind, String key) {
		if (improvementChangeOrders != null && BASE_PART.equals(key)) {
			if (basePart == null) {
				IPropertiesEditionPartProvider provider = PropertiesEditionPartProviderService.getInstance().getProvider(ScoViewsRepository.class);
				if (provider != null) {
					basePart = (ImprovementChangeOrdersPropertiesEditionPart)provider.getPropertiesEditionPart(ScoViewsRepository.ImprovementChangeOrders.class, kind, this);
					addListener((IPropertiesEditionListener)basePart);
				}
			}
			return (IPropertiesEditionPart)basePart;
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#
	 *      setPropertiesEditionPart(java.lang.Class, int, org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart)
	 * 
	 */
	public void setPropertiesEditionPart(java.lang.Class key, int kind, IPropertiesEditionPart propertiesEditionPart) {
		if (key == ScoViewsRepository.ImprovementChangeOrders.class)
			this.basePart = (ImprovementChangeOrdersPropertiesEditionPart) propertiesEditionPart;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent#initPart(java.lang.Class, int, org.eclipse.emf.ecore.EObject, 
	 *      org.eclipse.emf.ecore.resource.ResourceSet)
	 * 
	 */
	public void initPart(java.lang.Class key, int kind, EObject elt, ResourceSet allResource) {
		setInitializing(true);
		if (basePart != null && key == ScoViewsRepository.ImprovementChangeOrders.class) {
			((IPropertiesEditionPart)basePart).setContext(elt, allResource);
			final ImprovementChangeOrders improvementChangeOrders = (ImprovementChangeOrders)elt;
			// init values
			if (improvementChangeOrders.getName() != null)
				basePart.setName(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEString(), improvementChangeOrders.getName()));

			basePart.setValue(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEInt(), improvementChangeOrders.getValue()));

			basePart.initType((EEnum) ScoPackage.eINSTANCE.getChangeOrderCount_Type().getEType(), improvementChangeOrders.getType());
			basePart.setBrokenLines(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEInt(), improvementChangeOrders.getBrokenLines()));

			basePart.setFixedLines(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEInt(), improvementChangeOrders.getFixedLines()));

			basePart.setRepairEffort(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEDouble(), improvementChangeOrders.getRepairEffort()));

			// init filters






		}
		// init values for referenced views

		// init filters for referenced views

		setInitializing(false);
	}









	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent#getPropertiesEditionCommand
	 *     (org.eclipse.emf.edit.domain.EditingDomain)
	 * 
	 */
	public CompoundCommand getPropertiesEditionCommand(EditingDomain editingDomain) {
		CompoundCommand cc = new CompoundCommand();
		if ((improvementChangeOrders != null) && (basePart != null)) { 
			cc.append(SetCommand.create(editingDomain, improvementChangeOrders, ScoPackage.eINSTANCE.getChangeOrderCount_Name(), EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEString(), basePart.getName())));
			cc.append(SetCommand.create(editingDomain, improvementChangeOrders, ScoPackage.eINSTANCE.getChangeOrderCount_Value(), EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEInt(), basePart.getValue())));
			cc.append(SetCommand.create(editingDomain, improvementChangeOrders, ScoPackage.eINSTANCE.getChangeOrderCount_Type(), basePart.getType()));

			cc.append(SetCommand.create(editingDomain, improvementChangeOrders, ScoPackage.eINSTANCE.getChangeOrderCount_BrokenLines(), EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEInt(), basePart.getBrokenLines())));
			cc.append(SetCommand.create(editingDomain, improvementChangeOrders, ScoPackage.eINSTANCE.getChangeOrderCount_FixedLines(), EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEInt(), basePart.getFixedLines())));
			cc.append(SetCommand.create(editingDomain, improvementChangeOrders, ScoPackage.eINSTANCE.getChangeOrderCount_RepairEffort(), EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEDouble(), basePart.getRepairEffort())));

		}
		if (!cc.isEmpty())
			return cc;
		cc.append(IdentityCommand.INSTANCE);
		return cc;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent#getPropertiesEditionObject()
	 * 
	 */
	public EObject getPropertiesEditionObject(EObject source) {
		if (source instanceof ImprovementChangeOrders) {
			ImprovementChangeOrders improvementChangeOrdersToUpdate = (ImprovementChangeOrders)source;
			improvementChangeOrdersToUpdate.setName((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEString(), basePart.getName()));

			improvementChangeOrdersToUpdate.setValue(EEFConverterUtil.createIntFromString(EcorePackage.eINSTANCE.getEInt(), basePart.getValue()));

			improvementChangeOrdersToUpdate.setType((ChangeOrderType)basePart.getType());

			improvementChangeOrdersToUpdate.setBrokenLines(EEFConverterUtil.createIntFromString(EcorePackage.eINSTANCE.getEInt(), basePart.getBrokenLines()));

			improvementChangeOrdersToUpdate.setFixedLines(EEFConverterUtil.createIntFromString(EcorePackage.eINSTANCE.getEInt(), basePart.getFixedLines()));

			improvementChangeOrdersToUpdate.setRepairEffort(EEFConverterUtil.createDoubleFromString(EcorePackage.eINSTANCE.getEDouble(), basePart.getRepairEffort()));


			return improvementChangeOrdersToUpdate;
		}
		else
			return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionListener#firePropertiesChanged(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void firePropertiesChanged(IPropertiesEditionEvent event) {
		if (!isInitializing()) {
			Diagnostic valueDiagnostic = validateValue(event);
			if (PropertiesEditionEvent.COMMIT == event.getState() && IPropertiesEditionComponent.LIVE_MODE.equals(editing_mode) && valueDiagnostic.getSeverity() == Diagnostic.OK) {
				CompoundCommand command = new CompoundCommand();
			if (ScoViewsRepository.ImprovementChangeOrders.name == event.getAffectedEditor()) {
				command.append(SetCommand.create(liveEditingDomain, improvementChangeOrders, ScoPackage.eINSTANCE.getChangeOrderCount_Name(), EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEString(), (String)event.getNewValue())));
			}
			if (ScoViewsRepository.ImprovementChangeOrders.value == event.getAffectedEditor()) {
				command.append(SetCommand.create(liveEditingDomain, improvementChangeOrders, ScoPackage.eINSTANCE.getChangeOrderCount_Value(), EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEInt(), (String)event.getNewValue())));
			}
			if (ScoViewsRepository.ImprovementChangeOrders.type == event.getAffectedEditor())
				command.append(SetCommand.create(liveEditingDomain, improvementChangeOrders, ScoPackage.eINSTANCE.getChangeOrderCount_Type(), event.getNewValue()));

			if (ScoViewsRepository.ImprovementChangeOrders.brokenLines == event.getAffectedEditor()) {
				command.append(SetCommand.create(liveEditingDomain, improvementChangeOrders, ScoPackage.eINSTANCE.getChangeOrderCount_BrokenLines(), EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEInt(), (String)event.getNewValue())));
			}
			if (ScoViewsRepository.ImprovementChangeOrders.fixedLines == event.getAffectedEditor()) {
				command.append(SetCommand.create(liveEditingDomain, improvementChangeOrders, ScoPackage.eINSTANCE.getChangeOrderCount_FixedLines(), EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEInt(), (String)event.getNewValue())));
			}
			if (ScoViewsRepository.ImprovementChangeOrders.repairEffort == event.getAffectedEditor()) {
				command.append(SetCommand.create(liveEditingDomain, improvementChangeOrders, ScoPackage.eINSTANCE.getChangeOrderCount_RepairEffort(), EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEDouble(), (String)event.getNewValue())));
			}

				if (!command.isEmpty() && !command.canExecute()) {
					EEFRuntimePlugin.getDefault().logError("Cannot perform model change command.", null);
				} else {
					liveEditingDomain.getCommandStack().execute(command);
				}
			}
			if (valueDiagnostic.getSeverity() != Diagnostic.OK && valueDiagnostic instanceof BasicDiagnostic)
				super.firePropertiesChanged(new PropertiesValidationEditionEvent(event, valueDiagnostic));
			else {
				Diagnostic validate = validate();
				super.firePropertiesChanged(new PropertiesValidationEditionEvent(event, validate));
			}
			super.firePropertiesChanged(event);
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#isRequired(java.lang.String, int)
	 * 
	 */
	public boolean isRequired(String key, int kind) {
		return key == ScoViewsRepository.ImprovementChangeOrders.name || key == ScoViewsRepository.ImprovementChangeOrders.value || key == ScoViewsRepository.ImprovementChangeOrders.type || key == ScoViewsRepository.ImprovementChangeOrders.brokenLines || key == ScoViewsRepository.ImprovementChangeOrders.fixedLines || key == ScoViewsRepository.ImprovementChangeOrders.repairEffort;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#getHelpContent(java.lang.String, int)
	 * 
	 */
	public String getHelpContent(String key, int kind) {
		if (key == ScoViewsRepository.ImprovementChangeOrders.name)
			return "The name of the change order type"; //$NON-NLS-1$
		if (key == ScoViewsRepository.ImprovementChangeOrders.value)
			return "The number of change orders for this type"; //$NON-NLS-1$
		if (key == ScoViewsRepository.ImprovementChangeOrders.type)
			return "The change order type identifier"; //$NON-NLS-1$
		if (key == ScoViewsRepository.ImprovementChangeOrders.brokenLines)
			return "The estimated number of broken lines in the current artifact"; //$NON-NLS-1$
		if (key == ScoViewsRepository.ImprovementChangeOrders.fixedLines)
			return "The number of lines fixed in the current artifact and represented by the repair effort"; //$NON-NLS-1$
		if (key == ScoViewsRepository.ImprovementChangeOrders.repairEffort)
			return "The hours of repair effort corresponding to the fixed lines in the current artifact"; //$NON-NLS-1$
		return super.getHelpContent(key, kind);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent#validateValue(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public Diagnostic validateValue(IPropertiesEditionEvent event) {
		Diagnostic ret = Diagnostic.OK_INSTANCE;
		if (event.getNewValue() != null) {
			String newStringValue = event.getNewValue().toString();
			try {
				if (ScoViewsRepository.ImprovementChangeOrders.name == event.getAffectedEditor()) {
					Object newValue = EcoreUtil.createFromString(ScoPackage.eINSTANCE.getChangeOrderCount_Name().getEAttributeType(), newStringValue);
					ret = Diagnostician.INSTANCE.validate(ScoPackage.eINSTANCE.getChangeOrderCount_Name().getEAttributeType(), newValue);
				}
				if (ScoViewsRepository.ImprovementChangeOrders.value == event.getAffectedEditor()) {
					Object newValue = EcoreUtil.createFromString(ScoPackage.eINSTANCE.getChangeOrderCount_Value().getEAttributeType(), newStringValue);
					ret = Diagnostician.INSTANCE.validate(ScoPackage.eINSTANCE.getChangeOrderCount_Value().getEAttributeType(), newValue);
				}
				if (ScoViewsRepository.ImprovementChangeOrders.type == event.getAffectedEditor()) {
					Object newValue = EcoreUtil.createFromString(ScoPackage.eINSTANCE.getChangeOrderCount_Type().getEAttributeType(), newStringValue);
					ret = Diagnostician.INSTANCE.validate(ScoPackage.eINSTANCE.getChangeOrderCount_Type().getEAttributeType(), newValue);
				}
				if (ScoViewsRepository.ImprovementChangeOrders.brokenLines == event.getAffectedEditor()) {
					Object newValue = EcoreUtil.createFromString(ScoPackage.eINSTANCE.getChangeOrderCount_BrokenLines().getEAttributeType(), newStringValue);
					ret = Diagnostician.INSTANCE.validate(ScoPackage.eINSTANCE.getChangeOrderCount_BrokenLines().getEAttributeType(), newValue);
				}
				if (ScoViewsRepository.ImprovementChangeOrders.fixedLines == event.getAffectedEditor()) {
					Object newValue = EcoreUtil.createFromString(ScoPackage.eINSTANCE.getChangeOrderCount_FixedLines().getEAttributeType(), newStringValue);
					ret = Diagnostician.INSTANCE.validate(ScoPackage.eINSTANCE.getChangeOrderCount_FixedLines().getEAttributeType(), newValue);
				}
				if (ScoViewsRepository.ImprovementChangeOrders.repairEffort == event.getAffectedEditor()) {
					Object newValue = EcoreUtil.createFromString(ScoPackage.eINSTANCE.getChangeOrderCount_RepairEffort().getEAttributeType(), newStringValue);
					ret = Diagnostician.INSTANCE.validate(ScoPackage.eINSTANCE.getChangeOrderCount_RepairEffort().getEAttributeType(), newValue);
				}
			} catch (IllegalArgumentException iae) {
				ret = BasicDiagnostic.toDiagnostic(iae);
			} catch (WrappedException we) {
				ret = BasicDiagnostic.toDiagnostic(we);
			}
		}
		return ret;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent#validate()
	 * 
	 */
	public Diagnostic validate() {
		Diagnostic validate = Diagnostic.OK_INSTANCE;
		if (IPropertiesEditionComponent.BATCH_MODE.equals(editing_mode)) {
			EObject copy = EcoreUtil.copy(improvementChangeOrders);
			copy = getPropertiesEditionObject(copy);
			validate =  EEFRuntimePlugin.getEEFValidator().validate(copy);
		}
		else if (IPropertiesEditionComponent.LIVE_MODE.equals(editing_mode))
			validate = EEFRuntimePlugin.getEEFValidator().validate(improvementChangeOrders);
		// Start of user code for custom validation check
		
		// End of user code
		return validate;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent#dispose()
	 * 
	 */
	public void dispose() {
		if (semanticAdapter != null)
			improvementChangeOrders.eAdapters().remove(semanticAdapter);
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent#getTabText(java.lang.String)
	 * 
	 */
	public String getTabText(String p_key) {
		return basePart.getTitle();
	}
}
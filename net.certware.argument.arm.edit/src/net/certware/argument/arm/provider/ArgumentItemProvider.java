/**
 * Copyright (c) 2010 Object Management Group (ARM metamodel)
 * Copyright (c) 2010-2011 United States Government as represented by the Administrator for The National Aeronautics and Space Administration.  All Rights Reserved.  (generated models) 
 */
package net.certware.argument.arm.provider;


import java.util.Collection;
import java.util.List;

import net.certware.argument.arm.Argument;
import net.certware.argument.arm.ArmFactory;
import net.certware.argument.arm.ArmPackage;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link net.certware.argument.arm.Argument} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ArgumentItemProvider extends ModelElementItemProvider {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2010 Object Management Group (ARM metamodel)\nCopyright (c) 2010-2011 United States Government as represented by the Administrator for The National Aeronautics and Space Administration.  All Rights Reserved.  (generated models) "; //$NON-NLS-1$

	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArgumentItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

		}
		return itemPropertyDescriptors;
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(ArmPackage.Literals.ARGUMENT__CONTAINS_ARGUMENT_ELEMENT);
			childrenFeatures.add(ArmPackage.Literals.ARGUMENT__CONTAINS_ARGUMENT_LINK);
			childrenFeatures.add(ArmPackage.Literals.ARGUMENT__CONTAINS_ARGUMENT);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns Argument.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Argument")); //$NON-NLS-1$
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Argument)object).getIdentifier();
		return label == null || label.length() == 0 ?
			getString("_UI_Argument_type") : //$NON-NLS-1$
			getString("_UI_Argument_type") + " " + label; //$NON-NLS-1$ //$NON-NLS-2$
	}
	

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(Argument.class)) {
			case ArmPackage.ARGUMENT__CONTAINS_ARGUMENT_ELEMENT:
			case ArmPackage.ARGUMENT__CONTAINS_ARGUMENT_LINK:
			case ArmPackage.ARGUMENT__CONTAINS_ARGUMENT:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(ArmPackage.Literals.ARGUMENT__CONTAINS_ARGUMENT_ELEMENT,
				 ArmFactory.eINSTANCE.createClaim()));

		newChildDescriptors.add
			(createChildParameter
				(ArmPackage.Literals.ARGUMENT__CONTAINS_ARGUMENT_ELEMENT,
				 ArmFactory.eINSTANCE.createEvidenceAssertion()));

		newChildDescriptors.add
			(createChildParameter
				(ArmPackage.Literals.ARGUMENT__CONTAINS_ARGUMENT_ELEMENT,
				 ArmFactory.eINSTANCE.createInformationElement()));

		newChildDescriptors.add
			(createChildParameter
				(ArmPackage.Literals.ARGUMENT__CONTAINS_ARGUMENT_ELEMENT,
				 ArmFactory.eINSTANCE.createArgumentReasoning()));

		newChildDescriptors.add
			(createChildParameter
				(ArmPackage.Literals.ARGUMENT__CONTAINS_ARGUMENT_ELEMENT,
				 ArmFactory.eINSTANCE.createCitationElement()));

		newChildDescriptors.add
			(createChildParameter
				(ArmPackage.Literals.ARGUMENT__CONTAINS_ARGUMENT_LINK,
				 ArmFactory.eINSTANCE.createAnnotation()));

		newChildDescriptors.add
			(createChildParameter
				(ArmPackage.Literals.ARGUMENT__CONTAINS_ARGUMENT_LINK,
				 ArmFactory.eINSTANCE.createAssertedInference()));

		newChildDescriptors.add
			(createChildParameter
				(ArmPackage.Literals.ARGUMENT__CONTAINS_ARGUMENT_LINK,
				 ArmFactory.eINSTANCE.createAssertedEvidence()));

		newChildDescriptors.add
			(createChildParameter
				(ArmPackage.Literals.ARGUMENT__CONTAINS_ARGUMENT_LINK,
				 ArmFactory.eINSTANCE.createAssertedContext()));

		newChildDescriptors.add
			(createChildParameter
				(ArmPackage.Literals.ARGUMENT__CONTAINS_ARGUMENT_LINK,
				 ArmFactory.eINSTANCE.createAssertedCounterEvidence()));

		newChildDescriptors.add
			(createChildParameter
				(ArmPackage.Literals.ARGUMENT__CONTAINS_ARGUMENT_LINK,
				 ArmFactory.eINSTANCE.createAssertedChallenge()));

		newChildDescriptors.add
			(createChildParameter
				(ArmPackage.Literals.ARGUMENT__CONTAINS_ARGUMENT,
				 ArmFactory.eINSTANCE.createArgument()));
	}

}

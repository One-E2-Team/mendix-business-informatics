// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package businessbankmodule.proxies;

public class AgencyCodebook
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject agencyCodebookMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "BusinessBankModule.AgencyCodebook";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		code("code"),
		name("name");

		private java.lang.String metaName;

		MemberNames(java.lang.String s)
		{
			metaName = s;
		}

		@java.lang.Override
		public java.lang.String toString()
		{
			return metaName;
		}
	}

	public AgencyCodebook(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "BusinessBankModule.AgencyCodebook"));
	}

	protected AgencyCodebook(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject agencyCodebookMendixObject)
	{
		if (agencyCodebookMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("BusinessBankModule.AgencyCodebook", agencyCodebookMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a BusinessBankModule.AgencyCodebook");

		this.agencyCodebookMendixObject = agencyCodebookMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'AgencyCodebook.load(IContext, IMendixIdentifier)' instead.
	 */
	@java.lang.Deprecated
	public static businessbankmodule.proxies.AgencyCodebook initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return businessbankmodule.proxies.AgencyCodebook.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static businessbankmodule.proxies.AgencyCodebook initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new businessbankmodule.proxies.AgencyCodebook(context, mendixObject);
	}

	public static businessbankmodule.proxies.AgencyCodebook load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return businessbankmodule.proxies.AgencyCodebook.initialize(context, mendixObject);
	}

	public static java.util.List<businessbankmodule.proxies.AgencyCodebook> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<businessbankmodule.proxies.AgencyCodebook> result = new java.util.ArrayList<businessbankmodule.proxies.AgencyCodebook>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//BusinessBankModule.AgencyCodebook" + xpathConstraint))
			result.add(businessbankmodule.proxies.AgencyCodebook.initialize(context, obj));
		return result;
	}

	/**
	 * Commit the changes made on this proxy object.
	 */
	public final void commit() throws com.mendix.core.CoreException
	{
		com.mendix.core.Core.commit(context, getMendixObject());
	}

	/**
	 * Commit the changes made on this proxy object using the specified context.
	 */
	public final void commit(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		com.mendix.core.Core.commit(context, getMendixObject());
	}

	/**
	 * Delete the object.
	 */
	public final void delete()
	{
		com.mendix.core.Core.delete(context, getMendixObject());
	}

	/**
	 * Delete the object using the specified context.
	 */
	public final void delete(com.mendix.systemwideinterfaces.core.IContext context)
	{
		com.mendix.core.Core.delete(context, getMendixObject());
	}
	/**
	 * @return value of code
	 */
	public final java.lang.Integer getcode()
	{
		return getcode(getContext());
	}

	/**
	 * @param context
	 * @return value of code
	 */
	public final java.lang.Integer getcode(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Integer) getMendixObject().getValue(context, MemberNames.code.toString());
	}

	/**
	 * Set value of code
	 * @param code
	 */
	public final void setcode(java.lang.Integer code)
	{
		setcode(getContext(), code);
	}

	/**
	 * Set value of code
	 * @param context
	 * @param code
	 */
	public final void setcode(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Integer code)
	{
		getMendixObject().setValue(context, MemberNames.code.toString(), code);
	}

	/**
	 * @return value of name
	 */
	public final java.lang.String getname()
	{
		return getname(getContext());
	}

	/**
	 * @param context
	 * @return value of name
	 */
	public final java.lang.String getname(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.name.toString());
	}

	/**
	 * Set value of name
	 * @param name
	 */
	public final void setname(java.lang.String name)
	{
		setname(getContext(), name);
	}

	/**
	 * Set value of name
	 * @param context
	 * @param name
	 */
	public final void setname(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String name)
	{
		getMendixObject().setValue(context, MemberNames.name.toString(), name);
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return agencyCodebookMendixObject;
	}

	/**
	 * @return the IContext instance of this proxy, or null if no IContext instance was specified at initialization.
	 */
	public final com.mendix.systemwideinterfaces.core.IContext getContext()
	{
		return context;
	}

	@java.lang.Override
	public boolean equals(Object obj)
	{
		if (obj == this)
			return true;

		if (obj != null && getClass().equals(obj.getClass()))
		{
			final businessbankmodule.proxies.AgencyCodebook that = (businessbankmodule.proxies.AgencyCodebook) obj;
			return getMendixObject().equals(that.getMendixObject());
		}
		return false;
	}

	@java.lang.Override
	public int hashCode()
	{
		return getMendixObject().hashCode();
	}

	/**
	 * @return String name of this class
	 */
	public static java.lang.String getType()
	{
		return "BusinessBankModule.AgencyCodebook";
	}

	/**
	 * @return String GUID from this object, format: ID_0000000000
	 * @deprecated Use getMendixObject().getId().toLong() to get a unique identifier for this object.
	 */
	@java.lang.Deprecated
	public java.lang.String getGUID()
	{
		return "ID_" + getMendixObject().getId().toLong();
	}
}

/**
 * generated by Xtext 2.19.0
 */
package umlrtsyntesizer.scoping;

import java.util.Arrays;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.xbase.lib.InputOutput;
import umlrtsyntesizer.constLang.Attribute;
import umlrtsyntesizer.constLang.Context;
import umlrtsyntesizer.constLang.Expression;
import umlrtsyntesizer.constLang.MessageConstraint;
import umlrtsyntesizer.scoping.AbstractConstLangScopeProvider;

/**
 * This class contains custom scoping description.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#scoping
 * on how and when to use it.
 */
@SuppressWarnings("all")
public class ConstLangScopeProvider extends AbstractConstLangScopeProvider {
  public int containerLevel(final EObject o, final Class<?> ownerType) {
    int i = 1;
    EObject tempObject = o.eContainer();
    while ((tempObject != null)) {
      {
        boolean _isInstance = ownerType.isInstance(tempObject);
        if (_isInstance) {
          return i;
        }
        tempObject = tempObject.eContainer();
        i = (i + 1);
      }
    }
    return 0;
  }
  
  public EObject containerOfType(final EObject o, final Class<?> ownerType) {
    int i = 1;
    EObject tempObject = o.eContainer();
    while ((tempObject != null)) {
      {
        boolean _isInstance = ownerType.isInstance(tempObject);
        if (_isInstance) {
          return tempObject;
        }
        tempObject = tempObject.eContainer();
        i = (i + 1);
      }
    }
    return null;
  }
  
  protected IScope _extractScop(final Context att, final EReference ref) {
    IScope _xblockexpression = null;
    {
      IScope scop = IScope.NULLSCOPE;
      InputOutput.<String>println("scopping of context");
      _xblockexpression = scop;
    }
    return _xblockexpression;
  }
  
  protected IScope _extractScop(final Attribute att, final EReference ref) {
    IScope _xblockexpression = null;
    {
      IScope scop = IScope.NULLSCOPE;
      InputOutput.<String>print("test scoping expression");
      InputOutput.<String>println("scopping of attribute");
      _xblockexpression = scop;
    }
    return _xblockexpression;
  }
  
  protected IScope _extractScop(final Expression exp, final EReference ref) {
    IScope _xblockexpression = null;
    {
      IScope scop = IScope.NULLSCOPE;
      InputOutput.<String>print("test scoping expression");
      _xblockexpression = scop;
    }
    return _xblockexpression;
  }
  
  protected IScope _extractScop(final MessageConstraint exp, final EReference ref) {
    IScope _xblockexpression = null;
    {
      IScope scop = IScope.NULLSCOPE;
      InputOutput.<String>print("test scoping MessageConstraint");
      _xblockexpression = scop;
    }
    return _xblockexpression;
  }
  
  public IScope extractScop(final EObject att, final EReference ref) {
    if (att instanceof Attribute) {
      return _extractScop((Attribute)att, ref);
    } else if (att instanceof Context) {
      return _extractScop((Context)att, ref);
    } else if (att instanceof Expression) {
      return _extractScop((Expression)att, ref);
    } else if (att instanceof MessageConstraint) {
      return _extractScop((MessageConstraint)att, ref);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(att, ref).toString());
    }
  }
}
